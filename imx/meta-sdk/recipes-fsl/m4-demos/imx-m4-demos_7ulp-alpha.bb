# Copyright (C) 2016 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M4 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=be67a88e9e6c841043b005ad7bcf8309"

inherit deploy fsl-eula-unpack

M4_PKG_NAME = "imx7ulp-m4-demo-alpha"
SRC_URI = "${FSL_MIRROR}/${M4_PKG_NAME}.bin;fsl-eula=true"
S = "${WORKDIR}/${M4_PKG_NAME}"

SRC_URI[md5sum] = "85709b0ea8b14a687ee01fea0677cf3a"
SRC_URI[sha256sum] = "3182d73628d6a9cd8811c9effcebcb58f7fc9940ea422d4ef3db2dbd0c0ae416"

do_deploy () {
   # Install the demo binaries
   install -d ${DEPLOYDIR}
   find ${S}/ -name "*.img" -exec cp {} ${DEPLOYDIR}/ \;
   ls ${DEPLOYDIR}/
}

addtask deploy before do_build after do_compile

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx7ulp)"

