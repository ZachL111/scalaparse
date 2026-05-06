# Scalaparse Walkthrough

I use this file as a small checklist before changing the Scala implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | token drift | 184 | ship |
| stress | grammar width | 160 | ship |
| edge | label quality | 157 | ship |
| recovery | error locality | 224 | ship |
| stale | token drift | 144 | ship |

Start with `recovery` and `stale`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

`recovery` is the optimistic case; use it to make sure the scoring path still rewards strong signal.
