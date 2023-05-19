# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017 NXP

require recipes-bsp/firmware-imx/firmware-imx.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=6b552f505eedab4a11ab538cf3db743a"

SRC_URI[md5sum] = "088fb08b565748b537f6481b1ad6c9d7"
SRC_URI[sha256sum] = "9fa7c204a6ff8a30f2b5e8f9002d8c5736791e455dc137b952fa725dc0c3aeb8"

SRC_URI[imx-firmware.md5sum] = "25909f01825b099dc606542d085c305a"
SRC_URI[imx-firmware.sha256sum] = "3ced7e69a68268c93182035efbfd6ded5e066dcde787a104ad2b5fa47a38a65b"

#BRCM firmware v1.141.100.6
IMX_FIRMWARE_SRC ?= "git://github.com/nxp-imx/imx-firmware.git;name=imx-firmware;protocol=https"
SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
           ${IMX_FIRMWARE_SRC};branch=${SRCBRANCH};destsuffix=${S}/git "

SRCREV = "fd53ad55e33e838c196f69e2564894b0cd936b0d"
