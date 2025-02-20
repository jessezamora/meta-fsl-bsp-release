# Copyright (C) 2017-2018 NXP

SUMMARY = "OPTEE test"
HOMEPAGE = "http://www.optee.org/"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=daa2bcccc666345ab8940aab1315a4fa"

inherit pythonnative
DEPENDS = "optee-os-imx optee-client-imx python-pycrypto-native openssl"

SRCBRANCH = "imx_4.14.98_2.2.0"
OPTEE_TEST_SRC ?= "git://github.com/nxp-imx/imx-optee-test.git;protocol=https"
SRC_URI = "${OPTEE_TEST_SRC};branch=${SRCBRANCH}"
SRCREV = "b7114b828b82f2c0eec124ed424eff1230cc5319" 

S = "${WORKDIR}/git"

do_compile () {
    if [ ${DEFAULTTUNE} = "aarch64" ];then
        export TA_DEV_KIT_DIR=${STAGING_INCDIR}/optee/export-user_ta_arm64/
        export ARCH=arm64
    else
        export TA_DEV_KIT_DIR=${STAGING_INCDIR}/optee/export-user_ta_arm32/
        export ARCH=arm
    fi
    export OPTEE_CLIENT_EXPORT=${STAGING_DIR_HOST}/usr
    export CROSS_COMPILE_HOST=${HOST_PREFIX}
    export CROSS_COMPILE_TA=${HOST_PREFIX}
    export CROSS_COMPILE=${HOST_PREFIX}
    export OPTEE_OPENSSL_EXPORT=${STAGING_INCDIR}/
    oe_runmake V=1
}

do_install () {
    install -d ${D}/usr/bin
    install ${S}/out/xtest/xtest ${D}/usr/bin/

    install -d ${D}/lib/optee_armtz
    find ${S}/out/ta -name '*.ta' | while read name; do
    install -m 444 $name ${D}/lib/optee_armtz/
    done

}

FILES_${PN} = "/usr/bin/ /lib*/optee_armtz/"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
