# Copyright 2017-2018 NXP

IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "imx_4.9.88_imx8qxp_beta2"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "7bd868e4cfab71ea6f01a9bd9e8c49d1144821a2"

DEPENDS = "zlib-native openssl-native"
