# scalaparse

`scalaparse` is a Scala project in parsers. Its focus is to parse expressions with Pratt binding powers and AST snapshots.

## Why I Keep It Small

I want this repository to be useful as a quick reading exercise: fixtures first, implementation second, verifier last.

## Scalaparse Review Notes

For a quick review, compare `error locality` with `token drift` before reading the middle cases.

## Included Behavior

- `fixtures/domain_review.csv` adds cases for token drift and grammar width.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/scalaparse-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `error locality` and `token drift`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Internal Model

The core code exposes a scoring path and the added review layer uses `signal`, `slack`, `drag`, and `confidence`. The domain terms are `token drift`, `grammar width`, `label quality`, and `error locality`.

The Scala addition stays small enough to inspect in one sitting.

## Try It Locally

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Validation

The same command runs the local verification path. The highest-scoring domain case is `recovery` at 224, which lands in `ship`. The most cautious case is `stale` at 144, which lands in `ship`.

## Scope

No external service is required. A deeper version would add more negative cases and a clearer boundary around invalid input.
