# Use i.MX fork
SRC_URI_remove = "git://anongit.freedesktop.org/mesa/kmscube;branch=master;protocol=git"
KMSCUBE_SRC ?= "git://github.com/nxp-imx/kmscube-imx.git;protocol=https"
SRCBRANCH = "imx-kmscube"
SRC_URI_prepend = "${KMSCUBE_SRC};branch=${SRCBRANCH} "
SRCREV = "ee1ab26e0d689c92e6e20491e04eb0f096b11728"
