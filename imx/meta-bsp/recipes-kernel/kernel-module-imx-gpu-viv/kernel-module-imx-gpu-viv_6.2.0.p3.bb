# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "d6e7f9778878502fb3b438ab58b0d5c6"
SRC_URI[sha256sum] = "b79410127214239a5827d6cb58991e0fc4a6ce9aadbd9ac914c0f648dcc69042"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
