# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "b29be3613a84d3d8270a80569db888bb"
SRC_URI[sha256sum] = "848639b8584cfae86d42ddfc829de09f1b9664e00b650e608edbabc3939b4a50"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
