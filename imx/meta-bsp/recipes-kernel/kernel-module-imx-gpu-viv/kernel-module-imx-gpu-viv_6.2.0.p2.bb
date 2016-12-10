# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "48b09b1854ba6b2e7c372b18432782b3"
SRC_URI[sha256sum] = "014343d07788102b8a739dc91261854c51b32d9eec64dbf8ff6f4d68fb9365f4"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
