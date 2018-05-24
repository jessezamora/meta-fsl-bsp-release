# Copyright 2018 NXP

SUMMARY = "Qualcomm Wi-Fi and Bluetooth firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d \
                    file://QUALCOMM_ATHEROS_LICENSE_AGREEMENT.pdf;md5=e629669cf17f6a2a6872e067582986e3 \
"

inherit fsl-eula-unpack

SRC_URI = " ${FSL_MIRROR}/firmware-qca-${PV}.bin;fsl-eula=true"

SRC_URI[md5sum] = "e077ea99cc4b05eacdffb6262a086478"
SRC_URI[sha256sum] = "bd4b3d4dc16bac0d5d0b3d2d2a18a9d3bcf11663efe5ba0fdbd9239856442838"

S = "${WORKDIR}/firmware-qca-${PV}"
