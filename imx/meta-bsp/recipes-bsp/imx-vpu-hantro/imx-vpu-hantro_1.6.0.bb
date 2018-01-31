# Copyright 2017 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=08fd295cce89b0a9c74b9b83ed74f671"

SRC_URI[md5sum] = "7d630e3dcceb9546c3e0638391799dd7"
SRC_URI[sha256sum] = "499e4f3cc7f63a5ca77d43afc81e16b44e560e79dc35758f3beb979f84330fd0"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
