# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SECTION = "base"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

SRC_URI = " \
    ${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
"

SRC_URI[md5sum] = "08eb4b737c1cecfceee761f34a866834"
SRC_URI[sha256sum] = "6b8ab2199123a104297d87204f0161f034bca2648481f2c7d9dd483c6d80abd4"

S = "${WORKDIR}/firmware-imx-${PV}"

inherit fsl-eula-unpack
