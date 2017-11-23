# Copyright 2017 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SRCBRANCH = "imx_4.9.51_imx8m_beta"

LOCALVERSION = "-${SRCBRANCH}"

KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "13b87350655915200bd747df059ad8ed07dc7963"

S = "${WORKDIR}/git"
