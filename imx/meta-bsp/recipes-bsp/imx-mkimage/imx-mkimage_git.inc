# Copyright 2017-2018 NXP

IMX_MKIMAGE_SRC ?= "git://github.com/nxp-imx/imx-mkimage.git;protocol=https"
SRCBRANCH = "imx_4.14.78_1.0.0_ga"
SRC_URI = "${IMX_MKIMAGE_SRC};branch=${SRCBRANCH}"
SRCREV = "2cf091c075ea1950afa22a56e224dc4e448db542"

DEPENDS = "zlib-native openssl-native"
