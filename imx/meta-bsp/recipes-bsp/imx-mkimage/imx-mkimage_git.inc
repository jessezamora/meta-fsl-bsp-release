# Copyright 2017-2018 NXP

IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "imx_4.9.88_imx8qxp_beta2"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "0d2295ebdaae2a447d91e36fd3d2a2608c2e12af"

DEPENDS = "zlib-native openssl-native"
