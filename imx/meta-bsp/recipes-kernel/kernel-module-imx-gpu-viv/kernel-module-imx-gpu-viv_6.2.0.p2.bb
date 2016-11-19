# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "ecef08407d56a5f851b6ea1eaae441be"
SRC_URI[sha256sum] = "054ab9ab2ef47e1bdb129f94a3e99a2a9adc4d246583939a91a0d869bda3415e"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
