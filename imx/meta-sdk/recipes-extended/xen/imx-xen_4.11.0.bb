FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
require xen.inc

SRCBRANCH = "imx_4.14.98_2.3.0"
XEN_SRC ?= "git://github.com/nxp-imx/imx-xen.git;protocol=https"

SRC_URI = " \
    ${XEN_SRC};branch=${SRCBRANCH} \
    file://tools-xentop-vwprintw.patch \
    "

SRCREV = "ead638ce9240f9c9652ce7ddebf78d0b79f0b5f8"

S = "${WORKDIR}/git"

FILES_${PN}-scripts-common += " ${sysconfdir}/xen/*.cfg"

# provides for qemu build and runtime
PROVIDES = "xen"
RPROVIDES_${PN}-libxenstore += "xen-libxenstore"
RPROVIDES_${PN}-libxenctrl += "xen-libxenctrl"
RPROVIDES_${PN}-libxenguest += "xen-libxenguest"
