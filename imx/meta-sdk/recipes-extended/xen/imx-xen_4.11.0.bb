FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
require xen.inc

SRCBRANCH = "imx_4.14.62_1.0.0_beta"
XEN_SRC ?= "git://source.codeaurora.org/external/imx/imx-xen.git;protocol=https"

SRC_URI = " \
    ${XEN_SRC};branch=${SRCBRANCH} \
    file://tools-xentop-vwprintw.patch \
    "

SRCREV = "1b42481fcc957790540c69c6e5568cc3e68757ad"

S = "${WORKDIR}/git"

COMPATIBLE_MACHINE = "${@bb.utils.contains('MACHINE_FEATURES', 'xen', '${MACHINE}', '(^$)', d)}"
