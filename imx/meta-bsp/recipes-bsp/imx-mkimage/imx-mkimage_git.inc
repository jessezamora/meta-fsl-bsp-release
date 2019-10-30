# Copyright 2017-2019 NXP

IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "master"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "c73f253ada7f9895642caf15fade423273d06597"

DEPENDS = "zlib-native openssl-native"
