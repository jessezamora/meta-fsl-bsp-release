FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://M001-optimized-memset-for-AArch64.patch  \
            file://M002-optimized-memcpy-memmove-for-AArch64.patch \
            file://M003-further-tunes-memcpy-avoid-one-branch-for-sizes-1-3.patch \
            file://M004-optimized-memchr-for-AArch64.patch "
