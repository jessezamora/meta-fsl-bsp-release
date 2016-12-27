FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Set EGL device type for i.MX7ULP, keep it align with morty
EGLINFO_DEVICE_mx7ulp = "imx6"

# This patch is needed for V6 graphics

SRC_URI_append_mx6 = " \
    file://0001-Uuse-generic-eglplatform.h-rather-than-vendor-specif.patch \
"

SRC_URI_append_mx7ulp = " \
    file://0001-Uuse-generic-eglplatform.h-rather-than-vendor-specif.patch \
"
