# Copyright 2019 NXP

DESCRIPTION = "Hardening Library for Machine Learning Security"
SECTION = "security"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

DEPENDS = "opencv"

SRC_URI[md5sum] = "9c44cba30b7443993e8463f1fac4c8b303f5b3dadf72270ab0e3f3563232acfe"
SRC_URI[sha256sum] = "9c44cba30b7443993e8463f1fac4c8b303f5b3dadf72270ab0e3f3563232acfe"

S = "${WORKDIR}/ml-security"

inherit fsl-eula-unpack2

FILES_${PN} += " \
    ${datadir}/ml-security/examples/* \
"

RDEPENDS_${PN} = "bash"
