# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright (C) 2012-2014 O.S. Systems Software LTDA.
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-graphics/xorg-driver/xf86-video-imxfb-vivante.inc

SRC_URI = "${FSL_MIRROR}/xserver-xorg-video-imx-viv-${PV}.tar.gz \
            file://rc.autohdmi"

LIC_FILES_CHKSUM = "file://COPYING-MIT;md5=b5e9d9f5c02ea831ab3ecf802bb7c4f3"

SRC_URI[md5sum] = "0a169dd68d16da356ca40d2a23ddcc29"
SRC_URI[sha256sum] = "fd1b6263ed527ea5e8ecd6aa3f452bee5060f05086204dbfc1a8c1a81ab4f379"

S = "${WORKDIR}/xserver-xorg-video-imx-viv-${PV}/"
