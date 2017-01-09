# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017 NXP

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx6sll += "imx-vpu"
DEPENDS_mx7   += "imx-vpu"

PARALLEL_MAKE="-j 1"

SRC_URI[md5sum] = "c8baf823c97a843f5ee2018289c022ec"
SRC_URI[sha256sum] = "6d9701cb283fd772c029c1d1991a365f4c4987f6048922de68505bf80e45e3d9"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx6sll|mx7)"
