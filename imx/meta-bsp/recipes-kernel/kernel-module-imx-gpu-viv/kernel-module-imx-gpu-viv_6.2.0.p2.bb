# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "c8d0af728e9b5a69d965efd40e43d02e"
SRC_URI[sha256sum] = "ad00ba3ed977b435152a8c9e8bcca24515e859f809556bb1e885307a0be0b7f3"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
