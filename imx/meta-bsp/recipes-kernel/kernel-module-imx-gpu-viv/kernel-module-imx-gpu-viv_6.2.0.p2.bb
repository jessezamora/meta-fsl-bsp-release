# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "5d2a77c9a1a4219e6468ffb246183d35"
SRC_URI[sha256sum] = "c29b72e02f903ea1007d1e59862cb8269ae923a8ea10ce754eda2ac18be4585c"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
