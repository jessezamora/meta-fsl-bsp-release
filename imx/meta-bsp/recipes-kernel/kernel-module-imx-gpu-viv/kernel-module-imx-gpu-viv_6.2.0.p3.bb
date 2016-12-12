# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "c02c365920c63f9e811724578444a457"
SRC_URI[sha256sum] = "95dff1b1e3fb20705cbe0ca3e9c48bbf56339143f7f6f482fa65114d94892482"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
