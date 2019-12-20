LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRCBRANCH = "imx_4.14.98_2.3.0"
LOCALVERSION = "-2.3.0"
KERNEL_SRC ?= "git://source.codeaurora.org/external/imx/linux-imx.git;protocol=https"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"
SRCREV = "0f549d8c4d5edd68a2a492afd48228458d3bca4a"

S = "${WORKDIR}/git"
