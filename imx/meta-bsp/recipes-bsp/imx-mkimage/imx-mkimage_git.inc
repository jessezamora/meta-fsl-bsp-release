# Copyright 2017 NXP

IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRCBRANCH ?= "imx_4.9.51_imx8m_beta"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "7c3a73f0d90eb788d7d5d6dea1f129467961f0ce"
