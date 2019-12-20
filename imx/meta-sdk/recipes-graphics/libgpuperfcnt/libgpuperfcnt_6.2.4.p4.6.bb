DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d"

SRC_URI[arm-fb.md5sum] = "9400c22433e818c9f649ef8968bfd817"
SRC_URI[arm-fb.sha256sum] = "8441e8a33d2f0119a43da4327af7bb21a1fdbdfadbc6051c91e12f00c6296830"

SRC_URI[arm-wayland.md5sum] = "9a80394e06d97648619bae32007fc789"
SRC_URI[arm-wayland.sha256sum] = "15b6e129fcfcbc94a92d6229dc23e0691ceb2842decebe07ed11798cf482a656"

SRC_URI[arm-x11.md5sum] = "ce2686c2b94ef9095774baaa04f7bffb"
SRC_URI[arm-x11.sha256sum] = "784fc5aff2bb84a0437d75d1056e8f50f7d41eef1ed62b5f3c06b54be436a757"

SRC_URI[aarch64-fb.md5sum] = "a409df2ca7059f830b5400b6971f6d9b"
SRC_URI[aarch64-fb.sha256sum] = "4c6b2333a1b94bfd6b3d10db1cd06d5a3821ef10f58caa4ca2e6618696f8d231"

SRC_URI[aarch64-wayland.md5sum] = "a5c8c83769508fab0ac6468f9000e48b"
SRC_URI[aarch64-wayland.sha256sum] = "676b905b58910849058b24f5eb1176c375a45afed494408b090a985cc7c99e1e"

SRC_URI[aarch64-x11.md5sum] = "f3d2c418b85bbd8fa57e5b97afeab935"
SRC_URI[aarch64-x11.sha256sum] = "64081c827c2c074152383290f9a226bcb2ba03e21d05a22a107374e06a58d3e0"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
