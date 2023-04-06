# Copyright 2017-2018 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRCBRANCH = "imx_4.9.88_imx8mm_alpha"
LOCALVERSION = "-${SRCBRANCH}"

KERNEL_SRC ?= "git://github.com/nxp-imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "7bae8af57abb48c40529dbd92273ddfcda4bbdd5"

S = "${WORKDIR}/git"
