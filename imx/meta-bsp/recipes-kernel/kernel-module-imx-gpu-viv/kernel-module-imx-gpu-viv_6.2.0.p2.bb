# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "57ae95f8cb7110165e2957e42d469644"
SRC_URI[sha256sum] = "8c5b6d51fb1dbe455f87f874f8926e78f6e1159c782939fc76db3dede593b375"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
