# Copyright (C) 2013-2016 Freescale Semiconductor

include recipes-bsp/imx-test/imx-test.inc

DEPENDS_mx6sl += "imx-vpu"
DEPENDS_mx6sx += "imx-vpu"
DEPENDS_mx6ul += "imx-vpu"
DEPENDS_mx6sll += "imx-vpu"
DEPENDS_mx7   += "imx-vpu"

PARALLEL_MAKE="-j 1"

SRC_URI[md5sum] = "d6149a4230fe72a8865ca5bd391fa59d"
SRC_URI[sha256sum] = "5ac79968b1169dde8f4ef9f3d7639affde727b7c2fd92dadcf0576cdcbd5fc43"

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx6sll|mx7)"
