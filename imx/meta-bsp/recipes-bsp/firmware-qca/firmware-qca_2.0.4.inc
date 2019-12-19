# Copyright 2018-2019 NXP

SUMMARY = "Qualcomm Wi-Fi and Bluetooth firmware"
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3 \
                    file://QUALCOMM_ATHEROS_LICENSE_AGREEMENT.pdf;md5=e629669cf17f6a2a6872e067582986e3 \
"

SRC_URI[md5sum] = "5943dc45bbac60a5573063475e58e4fb"
SRC_URI[sha256sum] = "0554195e5d50e87c1afad3ec10727d415ee9bd6c49b660a83949102c3bdec5fe"

inherit fsl-eula2-unpack2

IMX_PACKAGE_NAME = "firmware-qca-${IMX_PACKAGE_VERSION}"
