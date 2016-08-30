# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://COPYING-MIT;md5=b5e9d9f5c02ea831ab3ecf802bb7c4f3"

SRC_URI[md5sum] = "8acbdddd51c9b1b0fd25137eeabd786d"
SRC_URI[sha256sum] = "3eed38193e31bb5ba8d2c817bd9b4f6e2fe7540d2cab36de9098cb4f11946a9f"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
