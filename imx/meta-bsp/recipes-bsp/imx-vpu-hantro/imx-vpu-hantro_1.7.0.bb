# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[md5sum] = "9a8ade25333e6ac3f7c345b71f3477a6"
SRC_URI[sha256sum] = "a3bbf2d8ac00ecae6d48b05cb94d9bdf68085d5bfc54eb176e3bf59670a87ad1"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
