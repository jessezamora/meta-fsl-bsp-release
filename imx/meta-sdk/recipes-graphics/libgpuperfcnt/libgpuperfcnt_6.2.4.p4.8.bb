DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fd4b227530cd88a82af6a5982cfb724d" 

SRC_URI[arm-fb.md5sum] = "363baa84fed85575b592ac1dd8901ebe"
SRC_URI[arm-fb.sha256sum] = "6d55a63025f71a53b2bec724f4fd4893e59426e0282c10ccdc9f1caef2cb38e3"

SRC_URI[arm-wayland.md5sum] = "8f93b8da8cc20e6ddaf744119e6be17e"
SRC_URI[arm-wayland.sha256sum] = "77fe0f6276a8f01b66e709d4d59b4812c44c11d118dcc91af9eaf8f5f35217b1"

SRC_URI[arm-x11.md5sum] = "00fcf575bcb76ed815982c350eabf5e1"
SRC_URI[arm-x11.sha256sum] = "ddef788cad8bcff8522db8223cbf4cd732e5fb5fa267c5156157ff0f08194e25"

SRC_URI[aarch64-fb.md5sum] = "a409df2ca7059f830b5400b6971f6d9b"
SRC_URI[aarch64-fb.sha256sum] = "4c6b2333a1b94bfd6b3d10db1cd06d5a3821ef10f58caa4ca2e6618696f8d231"

SRC_URI[aarch64-wayland.md5sum] = "a5c8c83769508fab0ac6468f9000e48b"
SRC_URI[aarch64-wayland.sha256sum] = "676b905b58910849058b24f5eb1176c375a45afed494408b090a985cc7c99e1e"

SRC_URI[aarch64-x11.md5sum] = "f3d2c418b85bbd8fa57e5b97afeab935"
SRC_URI[aarch64-x11.sha256sum] = "64081c827c2c074152383290f9a226bcb2ba03e21d05a22a107374e06a58d3e0"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

COMPATIBLE_MACHINE = "(imxgpu)"
