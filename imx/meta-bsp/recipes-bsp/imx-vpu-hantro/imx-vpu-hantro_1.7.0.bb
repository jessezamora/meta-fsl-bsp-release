# Copyright 2017-2018 NXP

require imx-vpu-hantro.inc
LIC_FILES_CHKSUM = "file://COPYING;md5=ab61cab9599935bfe9f700405ef00f28"

SRC_URI[md5sum] = "1b834d48c077a7bf553b141301bada15"
SRC_URI[sha256sum] = "c61c8bf8f51b2c68349a9155fa40eeea464a83faf33c91d199a7ef4f82608a42"

# Compatible only for i.MX with Hantro VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpuhantro = "${MACHINE}"
