# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "6d0f6966acabe9217d46319735d33b73"
SRC_URI[sha256sum] = "31ce2e904e7ece985f27e965a9673f180c94dce62a8792b6e192bc1586b89666"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
