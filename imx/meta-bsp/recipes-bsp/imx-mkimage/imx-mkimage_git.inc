# Copyright 2017-2019 NXP

IMX_MKIMAGE_SRC ?= "git://source.codeaurora.org/external/imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "master"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "30f536db4ddc015f09c8ff4b8a339de8c49b786c"

DEPENDS = "zlib-native openssl-native"
