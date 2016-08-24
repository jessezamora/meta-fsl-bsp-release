# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://COPYING-MIT;md5=b5e9d9f5c02ea831ab3ecf802bb7c4f3"

SRC_URI[md5sum] = "4a697a25706f223db2b5c904db534544"
SRC_URI[sha256sum] = "917c1e5718efda0907da64bf8466ae3f9577d0d4628c28e8e1cf26f281fc2aa6"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
