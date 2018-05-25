# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-codec.inc

PACKAGECONFIG_remove_imxvpuamphion = "vpu"

LIC_FILES_CHKSUM = "file://COPYING;md5=75abe2fa1d16ca79f87cde926f05f72d"

SRC_URI[md5sum] = "8983f80f8bf743cab9aadbca84233a1c"
SRC_URI[sha256sum] = "b9c400f9c3d9f275c0241b5b6f7cf2ea84cd64c49b77fee8c51ce29149147d4a"

COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"
