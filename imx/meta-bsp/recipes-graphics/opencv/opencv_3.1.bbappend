FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://0001-Fix-command-line-argument-handling-fixes-6525.patch \
                   file://0002-tapi-examples-Removing-defaults-from-all-command-lin.patch \
                   file://0003-fix-the-wrong-parameter-in-tvl1_optical_flow.cpp.patch \
                   file://0004-clahe.cl-has-some-incorrect-usage-of-opencl-__local-.patch \
"
