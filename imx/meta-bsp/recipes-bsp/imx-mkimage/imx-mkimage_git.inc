# Copyright 2017-2018 NXP

IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "imx_4.14.62_1.0.0_beta"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "7f7b5b25ed32ce7731b3b314d9750e96567f1cc5"

DEPENDS = "zlib-native openssl-native"
