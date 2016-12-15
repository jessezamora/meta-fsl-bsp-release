# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "75b3faa6170a137c762ca31cb56c0920"
SRC_URI[sha256sum] = "1e7b40d4285d08df5926ddf672365b9fc46f347e36f5a5345f744581d1a44bd9"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
