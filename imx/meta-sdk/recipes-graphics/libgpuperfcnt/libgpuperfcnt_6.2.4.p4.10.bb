DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=1b4db4b25c3a1e422c0c0ed64feb65d2"

SRC_URI[arm-fb.md5sum] = "363baa84fed85575b592ac1dd8901ebe"
SRC_URI[arm-fb.sha256sum] = "6d55a63025f71a53b2bec724f4fd4893e59426e0282c10ccdc9f1caef2cb38e3"

SRC_URI[arm-wayland.md5sum] = "8f93b8da8cc20e6ddaf744119e6be17e"
SRC_URI[arm-wayland.sha256sum] = "77fe0f6276a8f01b66e709d4d59b4812c44c11d118dcc91af9eaf8f5f35217b1"

SRC_URI[arm-x11.md5sum] = "71c09dc66ebc108e387580718988909b"
SRC_URI[arm-x11.sha256sum] = "cc29626108064123b8712fa230636ae0b67d849d7591da924879c056e20d4f8f"

SRC_URI[aarch64-fb.md5sum] = "e8f0d653ed8991fe9232bc61a2b93cb2"
SRC_URI[aarch64-fb.sha256sum] = "4431cde156148e3e20424ddd681a93351ac6c9a0601201e3c9b11472c0cea853"

SRC_URI[aarch64-wayland.md5sum] = "8e09713aafd048817db815e2adcbd897"
SRC_URI[aarch64-wayland.sha256sum] = "a5ef3f7712cf5aff3c59de697c5323d2483538af9cd35f68b0f7c5c756958a59"

SRC_URI[aarch64-x11.md5sum] = "f70acaa8d87c910447d295c50146a038"
SRC_URI[aarch64-x11.sha256sum] = "d51380db82cfdf736ff3d315c1242cd7c8c4b0e42d21f67205cccb7c1d6fab03"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

COMPATIBLE_MACHINE = "(imxgpu)"
