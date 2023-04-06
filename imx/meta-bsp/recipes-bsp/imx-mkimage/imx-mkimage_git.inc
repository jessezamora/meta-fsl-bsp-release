# Copyright 2017-2018 NXP

IMX_MKIMAGE_SRC ?= "git://github.com/nxp-imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "imx_4.9.88_imx8mm_alpha"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "0c3c9b79cd00c4e7adc306b7135b127948610bfd"

DEPENDS = "zlib-native openssl-native"
