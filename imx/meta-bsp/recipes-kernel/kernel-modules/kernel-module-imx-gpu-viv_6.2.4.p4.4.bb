# Copyright (C) 2015-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use a newer graphics release with an older kernel."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRCBRANCH = "imx_4.14.98_2.2.0"
LOCALVERSION = "-2.2.0"
KERNEL_SRC ?= "git://github.com/nxp-imx/linux-imx.git;protocol=https"
SRC_URI = " \
    ${KERNEL_SRC};branch=${SRCBRANCH};subpath=drivers/mxc/gpu-viv;destsuffix=git/src \
    file://Add-makefile.patch \
"
SRCREV = "32e2e7fd9f76d78f6c86d66419e0dfee28010c96"

S = "${WORKDIR}/git"

inherit module

EXTRA_OEMAKE += "CONFIG_MXC_GPU_VIV=m"

KERNEL_MODULE_AUTOLOAD = "galcore"
