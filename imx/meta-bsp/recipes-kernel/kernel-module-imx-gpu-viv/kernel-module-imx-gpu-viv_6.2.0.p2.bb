# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "b68b0fb227defc73c89b06bc74a16a81"
SRC_URI[sha256sum] = "f65b843aec0475f49bd3e87ff3ef86549d87d2a135aa5d1443b0c29e07143a14"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
