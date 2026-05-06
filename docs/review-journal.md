# Review Journal

The review surface for `scalaparse` is deliberately narrow: one fixture, one scoring rule, and one local check.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its parsers focus without claiming live deployment or external usage.

## Cases

- `baseline`: `token drift`, score 184, lane `ship`
- `stress`: `grammar width`, score 160, lane `ship`
- `edge`: `label quality`, score 157, lane `ship`
- `recovery`: `error locality`, score 224, lane `ship`
- `stale`: `token drift`, score 144, lane `ship`

## Note

This file is intentionally plain so the fixture remains the source of truth.
