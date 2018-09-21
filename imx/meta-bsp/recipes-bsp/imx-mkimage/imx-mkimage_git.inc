# Copyright 2017-2018 NXP

IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "imx_4.15.62_1.0.0_beta"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "8d87671d2fc04eac60dbe888a192cbfdc1c9476b"

DEPENDS = "zlib-native openssl-native"
