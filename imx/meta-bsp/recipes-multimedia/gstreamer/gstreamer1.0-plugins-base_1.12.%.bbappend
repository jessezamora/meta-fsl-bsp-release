FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
# Enable pango lib
PACKAGECONFIG_append = " pango "

# ion allocator will be enabled only when detecting the ion.h exists, which is built out from kernel.
# Now, ion allocator can be supported on all i.MX platform
DEPENDS_append = " virtual/kernel"

# Remove gio-unix-2.0 as it does not seem to exist anywhere
PACKAGECONFIG_remove = "gio-unix-2.0"
# Overwrite the unrecognised option which is set in gstreamer1.0-plugins-base.inc under poky layer
PACKAGECONFIG[gio-unix-2.0] = ""

# Use i.MX fork of GST for customizations
SRC_URI_remove_imx = " \
    http://gstreamer.freedesktop.org/src/gst-plugins-base/gst-plugins-base-${PV}.tar.xz \
"

GST1.0-PLUGINS-BASE_SRC ?= "gitsm://github.com/nxp-imx/gst-plugins-base.git;protocol=https"
SRCBRANCH = "MM_04.03.04_1801_L4.9.51_MX8M_GA"

SRC_URI_append_imx = " \
    ${GST1.0-PLUGINS-BASE_SRC};branch=${SRCBRANCH} \
"
SRCREV_imx = "3a615cab2e22e133048157ba107dc6c24e08c7e0"

EXTRA_AUTORECONF = ""

S_imx = "${WORKDIR}/git"
