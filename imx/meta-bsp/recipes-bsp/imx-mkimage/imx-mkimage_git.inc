# Copyright 2017-2019 NXP

IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "master"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "70b3c3a058e7ec9f311014dc792c210412a364cd"

DEPENDS = "zlib-native openssl-native"
