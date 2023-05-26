# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017 NXP

require recipes-bsp/firmware-imx/firmware-imx.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=6b552f505eedab4a11ab538cf3db743a"

SRC_URI = "${FSL_MIRROR}/firmware-imx-${PV}.bin;fsl-eula=true \
            ${IMX_FIRMWARE_SRC};branch=${SRCBRANCH};destsuffix=${S}/git "

SRC_URI[md5sum] = "088fb08b565748b537f6481b1ad6c9d7"
SRC_URI[sha256sum] = "9fa7c204a6ff8a30f2b5e8f9002d8c5736791e455dc137b952fa725dc0c3aeb8"
IMX_FIRMWARE_SRC ?= "git://github.com/nxp-imx/imx-firmware.git;protocol=https"

SRCREV = "fd53ad55e33e838c196f69e2564894b0cd936b0d"
